package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * AMPE情景服务预咨询
 *
 * @author auto create
 * @since 1.0, 2025-05-29 14:22:27
 */
public class AlipayOpenMiniAmpeRecommendPreconsultModel extends AlipayObject {

	private static final long serialVersionUID = 7727744854365618371L;

	/**
	 * null
	 */
	@ApiListField("biz_id_list")
	@ApiField("string")
	private List<String> bizIdList;

	/**
	 * 场景码，用于标记不同的场景。
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * AMPE设备ID，用于标记唯一的一台设备。
	 */
	@ApiField("device_id")
	private String deviceId;

	/**
	 * AMPE产品ID，在开放平台注册后可获取。
	 */
	@ApiField("product_id")
	private Long productId;

	/**
	 * 请求流水号。
	 */
	@ApiField("req_no")
	private String reqNo;

	public List<String> getBizIdList() {
		return this.bizIdList;
	}
	public void setBizIdList(List<String> bizIdList) {
		this.bizIdList = bizIdList;
	}

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getDeviceId() {
		return this.deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public Long getProductId() {
		return this.productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getReqNo() {
		return this.reqNo;
	}
	public void setReqNo(String reqNo) {
		this.reqNo = reqNo;
	}

}
