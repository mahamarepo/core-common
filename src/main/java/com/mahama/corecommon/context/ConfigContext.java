package com.mahama.corecommon.context;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class ConfigContext implements Serializable {
    /**
     * 强制忽略租户开关
     */
    private boolean ignoreTenant = false;

    /**
     * 强制忽略租户的临时表列表
     */
    private List<String> ignoreTenantTableList;
}
