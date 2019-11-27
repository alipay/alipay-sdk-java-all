package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 扎堆活动身份验证
 *
 * @author auto create
 * @since 1.0, 2016-10-25 14:15:51
 */
public class AlipayEcoEduZhaduiIdentityAuthModel extends AlipayObject {

	private static final long serialVersionUID = 3591165612233136951L;

	/**
	 * 验证的内容列表
	 */
	@ApiListField("active_contents")
	@ApiField("edu_active_content_request")
	private List<EduActiveContentRequest> activeContents;

	/**
	 * 请求发起的时间：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("request_datetime")
	private String requestDatetime;

	/**
	 * 支付宝的用户ID
	 */
	@ApiField("user_id")
	private String userId;

	public List<EduActiveContentRequest> getActiveContents() {
		return this.activeContents;
	}
	public void setActiveContents(List<EduActiveContentRequest> activeContents) {
		this.activeContents = activeContents;
	}

	public String getRequestDatetime() {
		return this.requestDatetime;
	}
	public void setRequestDatetime(String requestDatetime) {
		this.requestDatetime = requestDatetime;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
