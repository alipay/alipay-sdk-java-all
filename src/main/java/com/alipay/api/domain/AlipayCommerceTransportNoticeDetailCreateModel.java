package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 广深城际铁路公告创建接口
 *
 * @author auto create
 * @since 1.0, 2019-05-05 20:52:34
 */
public class AlipayCommerceTransportNoticeDetailCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7329665985361591725L;

	/**
	 * 公告内容
	 */
	@ApiField("content")
	private String content;

	/**
	 * 公告失效时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 公告ID
	 */
	@ApiField("id")
	private String id;

	/**
	 * 公告生效时间
	 */
	@ApiField("start_time")
	private Date startTime;

	/**
	 * 公告状态。 枚举值： ENABLE：启用 DISABLE：...
	 */
	@ApiField("status")
	private String status;

	/**
	 * 公告类型，能看到公告的人。 枚举值： USER：用户 AG...
	 */
	@ApiField("type")
	private String type;

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
