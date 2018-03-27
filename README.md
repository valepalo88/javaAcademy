# javaAcademy

The following example is the base for the refactoring exercise. 

1. Create a java 7 Maven project
2. Copy the following class
3. Let's start  


        class Bottles
        {    
            public static void main(String args[])
            {
                String s = "s";
                for (int beers=99; beers>-1;)
                {
                    System.out.print(beers + " bottle" + s + " of beer on the wall,");
                    System.out.println(beers + " bottle" + s + " of beer,");
                    if (beers==0)
                    {
                        System.out.print("Go to the store, buy some more,");
                        System.out.println("99 bottles of beer on the wall.\r\n");
                        return;
                    }
                    else
                        System.out.print("Take one down, pass it around,");
                    s = (--beers == 1)?"":"s";
                    System.out.println(beers + " bottle" + s + " of beer on the wall.\r\n");
                }
            }
