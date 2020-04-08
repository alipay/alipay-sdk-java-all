package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑isv风控事件发送接口
 *
 * @author auto create
 * @since 1.0, 2018-09-18 18:55:37
 */
public class KoubeiSecurityRiskEventSendModel extends AlipayObject {

	private static final long serialVersionUID = 5379242294599179116L;

	/**
	 * 每一个事件码对应的扩展信息，是Map<String,String>的类型JSON格式化的字符串，具体内容与场景相关，请联系接口负责人获取相关文档。
	 */
	@ApiField("business_info")
	private String businessInfo;

	/**
	 * 事件发生的gmt事件，单位为毫秒
	 */
	@ApiField("gmt_occur")
	private Long gmtOccur;

	/**
	 * 场景关联的产品名称，例如外部商户（EXT_MERCHANT），外部门店（EXT_SHOP）
	 */
	@ApiField("product")
	private String product;

	/**
	 * 唯一标识请求的id
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 业务场景码，描述一种具体的业务场景
	 */
	@ApiField("scene_code")
	private String sceneCode;

	public String getBusinessInfo() {
		return this.businessInfo;
	}
	public void setBusinessInfo(String businessInfo) {
		this.businessInfo = businessInfo;
	}

	public Long getGmtOccur() {
		return this.gmtOccur;
	}
	public void setGmtOccur(Long gmtOccur) {
		this.gmtOccur = gmtOccur;
	}

	public String getProduct() {
		return this.product;
	}
	public void setProduct(String product) {
		this.product = product;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

}
