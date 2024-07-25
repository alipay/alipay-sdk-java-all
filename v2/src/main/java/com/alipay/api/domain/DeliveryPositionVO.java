package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 展位投放内容视图模型
 *
 * @author auto create
 * @since 1.0, 2023-02-28 16:43:58
 */
public class DeliveryPositionVO extends AlipayObject {

	private static final long serialVersionUID = 3818446436185829266L;

	/**
	 * 投放展位展位代码
	 */
	@ApiField("position_code")
	private String positionCode;

	/**
	 * 投放展位内容列表
	 */
	@ApiListField("position_content")
	@ApiField("delivery_position_content_v_o")
	private List<DeliveryPositionContentVO> positionContent;

	public String getPositionCode() {
		return this.positionCode;
	}
	public void setPositionCode(String positionCode) {
		this.positionCode = positionCode;
	}

	public List<DeliveryPositionContentVO> getPositionContent() {
		return this.positionContent;
	}
	public void setPositionContent(List<DeliveryPositionContentVO> positionContent) {
		this.positionContent = positionContent;
	}

}
