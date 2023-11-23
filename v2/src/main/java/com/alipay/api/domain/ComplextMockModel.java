package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 负责对象mock模型
 *
 * @author auto create
 * @since 1.0, 2022-11-09 17:57:45
 */
public class ComplextMockModel extends AlipayObject {

	private static final long serialVersionUID = 8888223117219947465L;

	/**
	 * biz_model
	 */
	@ApiField("biz_model")
	private SimpleMockModel bizModel;

	/**
	 * 11
	 */
	@ApiField("biz_num")
	private Long bizNum;

	/**
	 * 208xxx
	 */
	@ApiField("biz_type")
	private String bizType;

	public SimpleMockModel getBizModel() {
		return this.bizModel;
	}
	public void setBizModel(SimpleMockModel bizModel) {
		this.bizModel = bizModel;
	}

	public Long getBizNum() {
		return this.bizNum;
	}
	public void setBizNum(Long bizNum) {
		this.bizNum = bizNum;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

}
