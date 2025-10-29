package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户投放展位内容数组
 *
 * @author auto create
 * @since 1.0, 2024-06-11 17:51:32
 */
public class DeliveryDetailPositionVO extends AlipayObject {

	private static final long serialVersionUID = 3664954589576796143L;

	/**
	 * 展位码
	 */
	@ApiField("position_code")
	private String positionCode;

	/**
	 * 投放内容透出信息，包含卡片数据，展位码，疲劳度信息
	 */
	@ApiField("position_content")
	private DeliveryDetailPositionContentVO positionContent;

	public String getPositionCode() {
		return this.positionCode;
	}
	public void setPositionCode(String positionCode) {
		this.positionCode = positionCode;
	}

	public DeliveryDetailPositionContentVO getPositionContent() {
		return this.positionContent;
	}
	public void setPositionContent(DeliveryDetailPositionContentVO positionContent) {
		this.positionContent = positionContent;
	}

}
