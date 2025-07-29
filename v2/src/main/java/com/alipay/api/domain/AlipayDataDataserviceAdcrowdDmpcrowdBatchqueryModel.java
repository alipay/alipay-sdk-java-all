package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 灯火广告定向dmp自定义人群查询
 *
 * @author auto create
 * @since 1.0, 2025-05-12 11:30:49
 */
public class AlipayDataDataserviceAdcrowdDmpcrowdBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 1249623125234331475L;

	/**
	 * 该参数可支持模糊搜索dmp自定义人群包名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 该参数为灯火商家唯一标识
	 */
	@ApiField("principal_tag")
	private String principalTag;

	/**
	 * 该参数表明查询dmp自定义人群时类型，INCLUDE: 自定义人群；EXCLUDE: 排除人群
	 */
	@ApiField("type")
	private String type;

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getPrincipalTag() {
		return this.principalTag;
	}
	public void setPrincipalTag(String principalTag) {
		this.principalTag = principalTag;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
