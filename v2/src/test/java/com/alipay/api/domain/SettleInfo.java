package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import java.util.List;

/**
 * 描述结算信息，json格式。
 *
 * @author auto create
 * @since 1.0, 2019-07-15 14:30:19
 */
public class SettleInfo extends AlipayObject {

    private static final long serialVersionUID = 7223843867657558662L;

    /**
     * 结算详细信息，json数组，目前只支持一条。
     */
    @ApiListField("settle_detail_infos")
    @ApiField("settle_detail_info")
    private List<SettleDetailInfo> settleDetailInfos;

    public List<SettleDetailInfo> getSettleDetailInfos() {
        return this.settleDetailInfos;
    }

    public void setSettleDetailInfos(List<SettleDetailInfo> settleDetailInfos) {
        this.settleDetailInfos = settleDetailInfos;
    }

}
