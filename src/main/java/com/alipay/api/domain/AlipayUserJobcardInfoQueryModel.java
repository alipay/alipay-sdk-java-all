package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户工作证信息查询接口
 *
 * @author auto create
 * @since 1.0, 2022-01-27 18:36:48
 */
public class AlipayUserJobcardInfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4311579261222244483L;

	/**
	 * 使用场景，如职位推荐
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 职位供应商code
	 */
	@ApiField("job_supplier_code")
	private String jobSupplierCode;

	/**
	 * 用户ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getJobSupplierCode() {
		return this.jobSupplierCode;
	}
	public void setJobSupplierCode(String jobSupplierCode) {
		this.jobSupplierCode = jobSupplierCode;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
