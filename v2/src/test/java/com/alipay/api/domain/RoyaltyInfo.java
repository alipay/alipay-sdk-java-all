package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import java.util.List;

/**
 * 分账信息
 *
 * @author auto create
 * @since 1.0, 2017-06-14 16:34:34
 */
public class RoyaltyInfo extends AlipayObject {

    private static final long serialVersionUID = 5549153337756216195L;

    /**
     * 分账明细的信息，可以描述多条分账指令，json数组。
     */
    @ApiListField("royalty_detail_infos")
    @ApiField("royalty_detail_infos")
    private List<RoyaltyDetailInfos> royaltyDetailInfos;

    /**
     * 分账类型 卖家的分账类型，目前只支持传入ROYALTY（普通分账类型）。
     */
    @ApiField("royalty_type")
    private String royaltyType;

    public List<RoyaltyDetailInfos> getRoyaltyDetailInfos() {
        return this.royaltyDetailInfos;
    }

    public void setRoyaltyDetailInfos(List<RoyaltyDetailInfos> royaltyDetailInfos) {
        this.royaltyDetailInfos = royaltyDetailInfos;
    }

    public String getRoyaltyType() {
        return this.royaltyType;
    }

    public void setRoyaltyType(String royaltyType) {
        this.royaltyType = royaltyType;
    }

}
