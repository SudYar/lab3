package SudYar;

public class Main {
    public static void main(String [] args){

        You you = new You("Ты");
        Relative rel = new Relative("родственник");
        rel.setAdjective("единственный");
        rel.setPronoun("его");
        He he = new He("него");
        he.setPronoun("у");
        Nobody nobody = new Nobody("никого");
        System.out.print("\"" +you.getName() + " " + rel.getPronoun() + " " + rel.getAdjective() + " " + rel.getName() + ", " +
                he.getPronoun() + " " + he.getName() + " " + nobody.getName() + " " + nobody.noHere() + ", " );
        you.setName("тебя");
        you.setPronoun("кроме");
        he.setName("его");
        System.out.println(you.getPronoun() + " " + you.getName() + ", " + he.getName() + " " + he.regret("просто") + ".");

        We we = new We("Мы");
        we.setPronoun("к");
        Julius man = new Julius("дяде Юлиусу");
        System.out.print(we.getName() + " " + we.should("быть") + " " + we.kind() + " " + we.getPronoun() + " " +
                man.poor() + " " + man.getName() + "\". ");

        man.setPronoun(" в ");
        System.out.println(EnumUnions.BUT.getName() + " " + man.lived("стоит ") + " " + man.poor() + " " + man.getName() +
                man.getPronoun() + EnumNouns.HOUSE.getName() + " " + EnumTimes.TWODAYS.getName() + ",");

        Kids kids = new Kids("детей");
        System.out.print(man.weary("своими непрерывными") + " " + EnumNouns.COMMENTS.getName() + " " + kids.getName() + ", ");

        man.setPronoun(" за ");
        System.out.println(man.pucky() + man.getPronoun() + EnumNouns.TABLE.getName() + EnumUnions.AND.getName() + man.whining() + "" +
                " " + EnumTimes.ALWAYS.getName() + EnumUnions.AS.getName());
        Mum mum = new Mum("она");
        mum.setFacePart("у мамы на лбу");
        Wrinkle wrinkle = new Wrinkle("складка");
        System.out.println(wrinkle.showUp(mum.getFacePart()) + " " + wrinkle.getName() + EnumUnions.AND.getName() + "" +
                mum.getName() + " " + mum.become() + " " + mum.silent() + EnumUnions.AND.getName() + mum.beStressful() + EnumUnions.AS.getName());

        Dad dad = new Dad("папа");
        man.setName("дядя Юлиус");
        man.setPronoun("в их ");
        System.out.println(dad.getName() + " " + EnumTimes.MOMENT.getName() + EnumUnions.AS.getName() + man.getName() +
                " " + man.showUp(man.getPronoun() + EnumNouns.HOUSE.getName()) + ".");

        kids.setName("Боссе и Бетан");
        man.setName("дяде Юлиусу");
        System.out.println(EnumUnions.A.getName() + kids.getName() + " " + kids.tr("так") + " " + kids.beFar() + " "  +
                man.getName() + EnumUnions.SO.getName() + kids.neverHome("почти") + " " + EnumNouns.HOUSE.getName() + EnumUnions.WHEN.getName());
        man.setName("дядя Юлиус");
        System.out.println(man.getName() + " " + man.showUp("у них в" + " " + EnumNouns.HOUSE.getName()) + ".");
    }
}
/*
«Ты его единственный родственник, у него никого нет, кроме тебя, его просто жаль.
 Мы должны быть добры к бедному дяде Юлиусу". Но стоит бедному дяде Юлиусу прожить в доме дня два,
 мучить детей своими непрерывными замечаниями, привередничать за столом и ныть по всякому поводу, как
 у мамы на лбу появляется складка и она становится молчаливой и напряженной, как
 папа с той самой минуты, как дядя Юлиус появлялся в их доме.
 А Боссе и Бетан так стараются не попадаться на глаза дяде Юлиусу, что почти не бывают в доме,
 когда дядя Юлиус появляется у них в доме.
*/
