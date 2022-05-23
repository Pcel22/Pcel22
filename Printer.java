public class Printer {
    boolean turnedOn = false;

    public void clickTurnOnButton(){
        turnedOn = !turnedOn;
    }

    public void print(String[] stih)
    {
        if(!isArrayIncorrect(stih))
        {
            if (!turnedOn)
            {
                System.out.println("Включите принтер!");
            }
            else
            {
                System.out.println("***");
                for (String line : stih)
                {
                    System.out.println(line);
                    System.out.println();
                }
                System.out.println("***");
            }
        }
        else {
            System.out.println("Битый файл");
        }
    }

    private boolean isArrayIncorrect(String[] array)
    {
        for(String a : array)
        {
            if(a == null)
            {
                return true;
            }
        }
        return false;
    }
}
