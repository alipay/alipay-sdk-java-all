package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 学校服务关系绑定
 *
 * @author auto create
 * @since 1.0, 2023-06-19 20:57:39
 */
public class AlipayCommerceEducateSchoolserviceBindModel extends AlipayObject {

	private static final long serialVersionUID = 7576129254476246342L;

	/**
	 * 场景
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 学校名称
	 */
	@ApiField("school_name")
	private String schoolName;

	/**
	 * 服务id列表
	 */
	@ApiListField("service_ids")
	@ApiField("string")
	private List<String> serviceIds;

	/**
	 * 来源类型
	 */
	@ApiField("source_type")
	private String sourceType;

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getSchoolName() {
		return this.schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public List<String> getServiceIds() {
		return this.serviceIds;
	}
	public void setServiceIds(List<String> serviceIds) {
		this.serviceIds = serviceIds;
	}

	public String getSourceType() {
		return this.sourceType;
	}
	public void setSourceType(String sourceType) {
		this.sourceType = sourceType;
	}

}
