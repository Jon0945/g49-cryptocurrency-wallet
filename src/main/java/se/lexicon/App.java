package se.lexicon;

import se.lexicon.dao.WalletDao;
import se.lexicon.dao.impl.WalletDaoImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        WalletDao walletDao = new WalletDaoImpl();
    }
}
