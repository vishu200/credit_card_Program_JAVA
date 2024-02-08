import java.time.LocalDate;
import java.util.Date;

class card
{
    private long cardNumber;
    private String cardType;
    private String cardName;
    private LocalDate cardExpiryDate;

    public card(long cardNumber, String cardType, String cardName, LocalDate cardExpiryDate) {
        this.cardNumber = cardNumber;
        this.cardType = cardType;
        this.cardName = cardName;
        this.cardExpiryDate = cardExpiryDate;
    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public void setCardNAme(String cardNAme) {
        cardName = cardNAme;
    }

    public void setCardExpiryDate(LocalDate cardExpiryDate) {
        this.cardExpiryDate = cardExpiryDate;
    }

    public long getcardnumber()
    {
        return cardNumber;

    }

    public String getCardType()
    {
        return cardType;
    }

    public String getCardNAme()
    {
        return cardName;
    }

    public LocalDate getCardExpiryDate() {
        return cardExpiryDate;
    }

    public void printing()
    {
        System.out.println("Card Number : " + cardNumber);
        System.out.println("Card Type : " + cardType);
        System.out.println("Card Name : " + cardName);
        System.out.println("Card Expiry Date : " + cardExpiryDate);
    }
}

class CreditCard extends card
{
    private int creditLimit;
    private int rewardPoints;
    private String cardHolderName;
    private int[] purchases =new int[20];
    private LocalDate billingDays;

    int productNum=0;



    //constructor


    public CreditCard(long cardNumber, String cardType, String cardNAme, LocalDate cardExpiryDate,int creditLimit,int rewardPoints,String cardHolderName,LocalDate billingDays) {
        super(cardNumber, cardType, cardNAme, cardExpiryDate);
        this.billingDays=billingDays;
        this.cardHolderName=cardHolderName;
        this.creditLimit=creditLimit;
        this.rewardPoints=rewardPoints;
    }

    //getter and setter section

    public int getCreditLimit() {
        return creditLimit;
    }

    public LocalDate getBillingDays() {
        return billingDays;
    }

    public int getRewardPoints() {
        return rewardPoints;
    }

    public void setBillingDays(LocalDate billingDays) {
        this.billingDays = billingDays;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    public void setCreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
    }

    public void setPurchases(int[] purchases) {
        this.purchases = purchases;
    }

    public void setRewardPoints(int rewardPoints) {
        this.rewardPoints = rewardPoints;
    }

    public int[] getPurchases() {
        return purchases;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    //to print the card details

    public void printCardData() {
        printing();
        System.out.println("Credit Limit: " + creditLimit);
        System.out.println("Reward Points: " + rewardPoints);
        System.out.println("Card Holder Name: " + cardHolderName);
        System.out.println("Purchases: " + java.util.Arrays.toString(purchases));
        System.out.println("Billing Days: " + billingDays);
    }


    //bussiness method or operational method

    public void PurchaseProduct(int amount)
    {
        if(creditLimit<amount)
        {
            System.out.println("limit exceed..!!");
            return;
        }
        purchases[productNum++]=amount;
        creditLimit-=amount;
        rewardPoints+=(amount*0.1);
    }
    public void avlCreditLimit()
    {
        System.out.println(this.creditLimit);
    }
    public void claimRewardPoints( int n)
    {
        if(rewardPoints<n)
        {
            System.out.println("unsufficient reward Points..!!");
            return;
        }
        rewardPoints-=n;
    }
}

public class day2_3 {

    public static void main(String[] args) {

        LocalDate expiryDate= LocalDate.of(2026,3,6);

        card newCard=new card(3253101004280l,"Visa","canara bank",expiryDate);
        newCard.printing();

        System.out.println();
        System.out.println();


        //by default on account oppening the reward point will be 50
        CreditCard card1 = new CreditCard(1234567890123456L, "Visa", "Canara Bank", LocalDate.of(2025, 12, 31), 50000, 50, "Vishu",LocalDate.now().plusMonths(1).withDayOfMonth(20));


        System.out.println("Card 1: " ); card1.printCardData();
        System.out.println();

        //purchase product method
        card1.PurchaseProduct(1000);
        card1.PurchaseProduct(20000);

        System.out.println("Card 1: " ); card1.printCardData();
        System.out.println();

        //available credit limit

        System.out.print("credit card limit : ");card1.avlCreditLimit();
        System.out.println();


        //claim reward points method

        card1.claimRewardPoints(500);

        System.out.println("Card 1: " ); card1.printCardData();
        System.out.println();

    }
}




