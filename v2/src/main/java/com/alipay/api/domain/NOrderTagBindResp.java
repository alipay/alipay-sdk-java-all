package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 物料绑定点位时所需要的物料参数
 *
 * @author auto create
 * @since 1.0, 2026-05-18 13:10:13
 */
public class NOrderTagBindResp extends AlipayObject {

	private static final long serialVersionUID = 3643265845946268462L;

	/**
	 * 服务商调用接口绑定点位和物料关系时的现场作业图片
	 */
	@ApiListField("bind_pic")
	@ApiField("string")
	private List<String> bindPic;

	/**
	 * 需要绑定点位的碰一下链接
	 */
	@ApiListField("nfc_url")
	@ApiField("string")
	private List<String> nfcUrl;

	/**
	 * 格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("operate_time")
	private String operateTime;

	/**
	 * 作业人员姓名
	 */
	@ApiField("operator_name")
	private String operatorName;

	/**
	 * 作业人员手机号
	 */
	@ApiField("operator_phone")
	private String operatorPhone;

	/**
	 * 碰一下跳转链接，用于绑定链接，需与coil_no一一对应
	 */
	@ApiListField("route_url")
	@ApiField("string")
	private List<String> routeUrl;

	public List<String> getBindPic() {
		return this.bindPic;
	}
	public void setBindPic(List<String> bindPic) {
		this.bindPic = bindPic;
	}

	public List<String> getNfcUrl() {
		return this.nfcUrl;
	}
	public void setNfcUrl(List<String> nfcUrl) {
		this.nfcUrl = nfcUrl;
	}

	public String getOperateTime() {
		return this.operateTime;
	}
	public void setOperateTime(String operateTime) {
		this.operateTime = operateTime;
	}

	public String getOperatorName() {
		return this.operatorName;
	}
	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}

	public String getOperatorPhone() {
		return this.operatorPhone;
	}
	public void setOperatorPhone(String operatorPhone) {
		this.operatorPhone = operatorPhone;
	}

	public List<String> getRouteUrl() {
		return this.routeUrl;
	}
	public void setRouteUrl(List<String> routeUrl) {
		this.routeUrl = routeUrl;
	}

}
