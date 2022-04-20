package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小蚁触角，防打扰咨询接口
 *
 * @author auto create
 * @since 1.0, 2020-03-23 10:44:18
 */
public class AlipayIserviceMindvTroublefreeruleConsultModel extends AlipayObject {

	private static final long serialVersionUID = 2788837814615258245L;

	/**
	 * 问卷ID值，调研平台获取
	 */
	@ApiField("job_id")
	private String jobId;

	/**
	 * 产品ID值，调研平台进行查询
	 */
	@ApiField("product_id")
	private Long productId;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getJobId() {
		return this.jobId;
	}
	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	public Long getProductId() {
		return this.productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
