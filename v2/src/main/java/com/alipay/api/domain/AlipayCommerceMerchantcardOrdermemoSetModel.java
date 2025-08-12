package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单备注管理
 *
 * @author auto create
 * @since 1.0, 2025-06-09 14:17:39
 */
public class AlipayCommerceMerchantcardOrdermemoSetModel extends AlipayObject {

	private static final long serialVersionUID = 5197621814935842842L;

	/**
	 * 备注信息
	 */
	@ApiField("axf_order_memo_info")
	private AxfOrderMemoInfo axfOrderMemoInfo;

	/**
	 * 售卖订单ID。即需要添加备注的订单
	 */
	@ApiField("card_id")
	private String cardId;

	/**
	 * 操作类型。表示此次操作类型
	 */
	@ApiField("operate_type")
	private String operateType;

	public AxfOrderMemoInfo getAxfOrderMemoInfo() {
		return this.axfOrderMemoInfo;
	}
	public void setAxfOrderMemoInfo(AxfOrderMemoInfo axfOrderMemoInfo) {
		this.axfOrderMemoInfo = axfOrderMemoInfo;
	}

	public String getCardId() {
		return this.cardId;
	}
	public void setCardId(String cardId) {
		this.cardId = cardId;
	}

	public String getOperateType() {
		return this.operateType;
	}
	public void setOperateType(String operateType) {
		this.operateType = operateType;
	}

}
