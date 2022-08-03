package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 森林能量发放
 *
 * @author auto create
 * @since 1.0, 2022-06-22 17:32:42
 */
public class AlipayEcoActivityRecycleSendModel extends AlipayObject {

	private static final long serialVersionUID = 3252642687236381734L;

	/**
	 * 买家的用户id
	 */
	@ApiField("buyer_id")
	private String buyerId;

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

	public String getBuyerId() {
		return this.buyerId;
	}
	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
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

}
