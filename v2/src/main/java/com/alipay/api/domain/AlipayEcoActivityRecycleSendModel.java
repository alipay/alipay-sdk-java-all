package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 森林能量发放
 *
 * @author auto create
 * @since 1.0, 2024-01-18 14:15:51
 */
public class AlipayEcoActivityRecycleSendModel extends AlipayObject {

	private static final long serialVersionUID = 5677235533438585427L;

	/**
	 * 买家的用户id
	 */
	@ApiField("buyer_id")
	private String buyerId;

	/**
	 * 买家的用户id
	 */
	@ApiField("buyer_open_id")
	private String buyerOpenId;

	/**
	 * C端用户使用的绿色小程序appId
	 */
	@ApiField("energy_appid")
	private String energyAppid;

	/**
	 * 发放的物品清单明细
	 */
	@ApiListField("item_list")
	@ApiField("energy_good_request")
	private List<EnergyGoodRequest> itemList;

	/**
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 外部业务类型
	 */
	@ApiField("out_biz_type")
	private String outBizType;

	/**
	 * 卖家的用户id
	 */
	@ApiField("seller_id")
	private String sellerId;

	/**
	 * 卖家的用户id
	 */
	@ApiField("seller_open_id")
	private String sellerOpenId;

	public String getBuyerId() {
		return this.buyerId;
	}
	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}

	public String getBuyerOpenId() {
		return this.buyerOpenId;
	}
	public void setBuyerOpenId(String buyerOpenId) {
		this.buyerOpenId = buyerOpenId;
	}

	public String getEnergyAppid() {
		return this.energyAppid;
	}
	public void setEnergyAppid(String energyAppid) {
		this.energyAppid = energyAppid;
	}

	public List<EnergyGoodRequest> getItemList() {
		return this.itemList;
	}
	public void setItemList(List<EnergyGoodRequest> itemList) {
		this.itemList = itemList;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getOutBizType() {
		return this.outBizType;
	}
	public void setOutBizType(String outBizType) {
		this.outBizType = outBizType;
	}

	public String getSellerId() {
		return this.sellerId;
	}
	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}

	public String getSellerOpenId() {
		return this.sellerOpenId;
	}
	public void setSellerOpenId(String sellerOpenId) {
		this.sellerOpenId = sellerOpenId;
	}

}
