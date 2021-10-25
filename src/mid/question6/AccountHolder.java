package question6;
/**
 * The AccountHolder class represent the person details
 * @version 1.0.0
 * @since 10/20/2021
 * @author shashank_indukuri
 * DePaul University
 * Copyright (c) 2021
 */

import java.util.ArrayList;

public class AccountHolder {
    protected int ID;
    protected String address;
    protected ArrayList<Account> accounts = new ArrayList<>();

    public int nextID() {
        return 1;
    }
}
