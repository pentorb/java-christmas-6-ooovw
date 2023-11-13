package christmas.model;

public enum Badge {
    NOTHING("없음", 0),
    STAR_BADGE("스타", 5_000),
    TREE_BADGE("트리", 10_000),
    SANTA_BADGE("산타", 20_000);

    public static String shapeOfBadge = "";

    private final String shape;
    private final int discount;

    Badge(String shape, int discount) {
        this.shape = shape;
        this.discount = discount;
    }

    private int getDiscount() {
        return discount;
    }

    public static void receiveBadge() {
        if (Discount.amountOfDiscount >= SANTA_BADGE.getDiscount()) {
            shapeOfBadge = SANTA_BADGE.shape;
        }

        else if (Discount.amountOfDiscount >= TREE_BADGE.getDiscount()) {
            shapeOfBadge = TREE_BADGE.shape;
        }

        else if (Discount.amountOfDiscount >= STAR_BADGE.getDiscount()) {
            shapeOfBadge = STAR_BADGE.shape;
        }

        else if (Discount.amountOfDiscount >= NOTHING.getDiscount()) {
            shapeOfBadge = NOTHING.shape;
        }
    }
}
