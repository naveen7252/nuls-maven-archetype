package ${package};

import io.nuls.contract.sdk.*;
import io.nuls.contract.sdk.annotation.Payable;
import io.nuls.contract.sdk.annotation.Required;
import io.nuls.contract.sdk.annotation.View;

public class SampleContract implements Contract{

    private String message;

    @View
    public String getMessage(String message){
        this.message = message;
        return message;
    }

}