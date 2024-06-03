package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 通用回调接口
 *
 * @author auto create
 * @since 1.0, 2023-12-18 15:46:13
 */
public class AlipayInsAutoAutoinsprodCommonConsultModel extends AlipayObject {

	private static final long serialVersionUID = 5312137533723922131L;

	/**
	 * 业务内容
具体内容按照业务类型对应的key值传输
	 */
	@ApiField("biz_data")
	private String bizData;

	/**
	 * 业务场景码
AUTO_GET_CAR_MODEL_LIST	获取车型列表
AUTO_GET_COMPANY_LIST_IN_SERVICE	获取可报价机构列表
AUTO_ SEND_MOBILE_MSG_FOR_BEIJING	发送北京验证码请求
AUTO_VERIFY_MOBILE_MSG_FOR_BEIJING	验证北京验证码请求
AUTO_GET_DELIVER_GROUP	获取保单配送地区分组
AUTO_GET_CHECK_CODE_BEFORE_PAY	下单之前获取中保信验证码
AUTO_ VERIFY_CHECK_CODE_BEFORE_PAY_FOR	下单之前验证中保信验证码
	 */
	@ApiField("biz_type")
	private String bizType;

	public String getBizData() {
		return this.bizData;
	}
	public void setBizData(String bizData) {
		this.bizData = bizData;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

}
