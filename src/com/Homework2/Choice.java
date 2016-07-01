package com.Homework2;

import com.epam.spb.lection2.*;
import com.sun.xml.internal.ws.api.message.ExceptionHasMessage;

/**
 * Created by maxim on 01.07.2016.
 */
public class Choice {
    public int makeChoice(int answer) {
        switch (answer) {
            case 1: {
                String[] str = new String[2];
                str[0] = "Hello";
                str[1] = "world";
                ArgumentsExample.main(str);
                break;
            }

            case 2: {
                try {
                    AutoPack.main(null);
                }
                catch (Exception e){
                    System.out.println("\n***EXCEPTION***\n");
                }
                break;
            }

            case 3: {
                BigExample.main(null);
                break;
            }

            case 4: {
                BitOperations.main(null);
                break;
            }

            case 5: {
                CharsTest.main(null);
                break;
            }

            case 6: {
                ClassExample.main(null);
                break;
            }

            case 7: {
                CoverClasses.main(null);
                break;
            }

            case 8: {
                DataTypes.main(null);
                break;
            }

            case 9: {
                Import.main(null);
                break;
            }

            case 10: {
                InstanceOf.main(null);
                break;
            }

            case 11: {
                LogicOperations.main(null);
                break;
            }

            case 12: {
                Main.main(null);
                break;
            }

            case 13: {
                Operators.main(null);
                break;
            }

            case 14: {
                StringTransformation.main(null);
                break;
            }

            case 15: {
                UnaryOperators.main(null);
                break;
            }

            case 16: {
                return 0;
            }
            default:
                System.out.println("Illegal answer.");
        }
        return 1;
    }
}
