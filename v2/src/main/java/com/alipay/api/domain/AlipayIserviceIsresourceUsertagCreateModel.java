package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 星云资源库创建用户标签
 *
 * @author auto create
 * @since 1.0, 2023-05-17 15:07:11
 */
public class AlipayIserviceIsresourceUsertagCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8257212232844359167L;

	/**
	 * 数据版本，格式为日期的yyyyMMdd
	 */
	@ApiField("dt")
	private String dt;

	/**
	 * 标签级别，表示标签绑定在那个层级
	 */
	@ApiField("tag_level")
	private String tagLevel;

	/**
	 * 租户级别关联使用，如：租户级别为TENANT时，该值需要填写具体是哪个租户（CS_HELLOBIKE_MS）
	 */
	@ApiField("tag_level_value")
	private String tagLevelValue;

	/**
	 * 用户id
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 用户标签的具体内容
	 */
	@ApiField("value")
	private String value;

	public String getDt() {
		return this.dt;
	}
	public void setDt(String dt) {
		this.dt = dt;
	}

	public String getTagLevel() {
		return this.tagLevel;
	}
	public void setTagLevel(String tagLevel) {
		this.tagLevel = tagLevel;
	}

	public String getTagLevelValue() {
		return this.tagLevelValue;
	}
	public void setTagLevelValue(String tagLevelValue) {
		this.tagLevelValue = tagLevelValue;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
