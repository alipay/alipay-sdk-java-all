package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 单元定向
 *
 * @author auto create
 * @since 1.0, 2019-10-16 10:23:25
 */
public class OuterTargetingItem extends AlipayObject {

	private static final long serialVersionUID = 1393533488928761474L;

	/**
	 * 定向类型：
REGION_LIST: 实时地址
AD_POS_LIST: 广告位定向
OUTER_KOUBEI_INTEREST_TAG_LIST: 口碑偏好
OUTER_KOUBEI_CROWD_TAG_LIST：口碑人群
	 */
	@ApiField("type")
	private String type;

	/**
	 * 定向值
	 */
	@ApiListField("value_list")
	@ApiField("string")
	private List<String> valueList;

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public List<String> getValueList() {
		return this.valueList;
	}
	public void setValueList(List<String> valueList) {
		this.valueList = valueList;
	}

}
