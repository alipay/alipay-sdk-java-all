package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 展位疲劳度上报
 *
 * @author auto create
 * @since 1.0, 2024-06-11 17:51:43
 */
public class AntfortuneStockDeliverydetailFatigueSyncModel extends AlipayObject {

	private static final long serialVersionUID = 8848789957423399983L;

	/**
	 * 用户行为
	 */
	@ApiField("action")
	private String action;

	/**
	 * 签约协议号（uid在某个机构处的唯一标识）
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 展位疲劳度
	 */
	@ApiListField("position_delivery_model")
	@ApiField("position_delivery_fatigue_info")
	private List<PositionDeliveryFatigueInfo> positionDeliveryModel;

	public String getAction() {
		return this.action;
	}
	public void setAction(String action) {
		this.action = action;
	}

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	public List<PositionDeliveryFatigueInfo> getPositionDeliveryModel() {
		return this.positionDeliveryModel;
	}
	public void setPositionDeliveryModel(List<PositionDeliveryFatigueInfo> positionDeliveryModel) {
		this.positionDeliveryModel = positionDeliveryModel;
	}

}
