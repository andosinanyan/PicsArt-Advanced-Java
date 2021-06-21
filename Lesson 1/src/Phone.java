public class Phone {
    private String model;
    private int price;
    private AndroidSystem phoneOS;
    private int[] phoneBook;

    public int[] getPhoneBook() {
        return phoneBook;
    }

    public void setPhoneBook(int[] phoneBook) {
        this.phoneBook = phoneBook;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public AndroidSystem getPhoneOS() {
        return phoneOS;
    }

    public void setPhoneOS(AndroidSystem phoneOS) {
        this.phoneOS = phoneOS;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("Phone model is - ")
                .append(model)
                .append("\nThe price is - ")
                .append(price)
                .append('$')
                .append("\nThe phone OS is - ")
                .append(phoneOS.toString());
        return String.valueOf(str);
    }
}
