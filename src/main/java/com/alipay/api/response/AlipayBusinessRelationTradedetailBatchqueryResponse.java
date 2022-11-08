package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.BusinessRelationShopTradeDetailInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.business.relation.tradedetail.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2022-09-20 10:16:58
 */
public class AlipayBusinessRelationTradedetailBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6255682335362943367L;

	/** 
	 * 物理门店id
	 */
	@ApiField("real_shop_id")
	private String realShopId;

	/** 
	 * 门店编号
	 */
	@ApiField("real_shop_no")
	private String realShopNo;

	/** 
	 * 门店确权状态，READY、PENDING两种状态
	 */
	@ApiField("shop_confirm_status")
	private String shopConfirmStatus;

	/** 
	 * 门店名称
	 */
	@ApiField("shop_name")
	private String shopName;

	/** 
	 * 门店交易数据详细信息列表
	 */
	@ApiListField("shop_trade_data_detail_infos")
	@ApiField("business_relation_shop_trade_detail_info")
	private List<BusinessRelationShopTradeDetailInfo> shopTradeDataDetailInfos;

	/** 
	 * 门店总数
	 */
	@ApiField("total_num")
	private String totalNum;

	public void setRealShopId(String realShopId) {
		this.realShopId = realShopId;
	}
	public String getRealShopId( ) {
		return this.realShopId;
	}

	public void setRealShopNo(String realShopNo) {
		this.realShopNo = realShopNo;
	}
	public String getRealShopNo( ) {
		return this.realShopNo;
	}

	public void setShopConfirmStatus(String shopConfirmStatus) {
		this.shopConfirmStatus = shopConfirmStatus;
	}
	public String getShopConfirmStatus( ) {
		return this.shopConfirmStatus;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public String getShopName( ) {
		return this.shopName;
	}

	public void setShopTradeDataDetailInfos(List<BusinessRelationShopTradeDetailInfo> shopTradeDataDetailInfos) {
		this.shopTradeDataDetailInfos = shopTradeDataDetailInfos;
	}
	public List<BusinessRelationShopTradeDetailInfo> getShopTradeDataDetailInfos( ) {
		return this.shopTradeDataDetailInfos;
	}

	public void setTotalNum(String totalNum) {
		this.totalNum = totalNum;
	}
	public String getTotalNum( ) {
		return this.totalNum;
	}

}
