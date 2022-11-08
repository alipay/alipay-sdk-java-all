package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.BusinessRelationTradeInfo;
import com.alipay.api.domain.BusinessRelationShopTradeInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.business.relation.tradedata.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2022-06-16 20:26:46
 */
public class AlipayBusinessRelationTradedataBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6162678877873174152L;

	/** 
	 * 商圈经营数据信息
	 */
	@ApiField("mall_trade_data_info")
	private BusinessRelationTradeInfo mallTradeDataInfo;

	/** 
	 * 门店经营数据信息列表
	 */
	@ApiListField("shop_trade_data_infos")
	@ApiField("business_relation_shop_trade_info")
	private List<BusinessRelationShopTradeInfo> shopTradeDataInfos;

	/** 
	 * 门店总数
	 */
	@ApiField("total_num")
	private Long totalNum;

	public void setMallTradeDataInfo(BusinessRelationTradeInfo mallTradeDataInfo) {
		this.mallTradeDataInfo = mallTradeDataInfo;
	}
	public BusinessRelationTradeInfo getMallTradeDataInfo( ) {
		return this.mallTradeDataInfo;
	}

	public void setShopTradeDataInfos(List<BusinessRelationShopTradeInfo> shopTradeDataInfos) {
		this.shopTradeDataInfos = shopTradeDataInfos;
	}
	public List<BusinessRelationShopTradeInfo> getShopTradeDataInfos( ) {
		return this.shopTradeDataInfos;
	}

	public void setTotalNum(Long totalNum) {
		this.totalNum = totalNum;
	}
	public Long getTotalNum( ) {
		return this.totalNum;
	}

}
