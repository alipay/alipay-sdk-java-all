package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 广告启用API
 *
 * @author auto create
 * @since 1.0, 2021-09-16 17:30:10
 */
public class AlipayDataDataserviceAdOnlineModel extends AlipayObject {

	private static final long serialVersionUID = 8263541649317947895L;

	/**
	 * 灯火平台提供给外部系统的访问token
	 */
	@ApiField("biz_token")
	private String bizToken;

	/**
	 * 操作的广告层级类型，如计划(plan)，单元(group)，创意 （creative），分组标识（batchTag），店铺标识（store）
	 */
	@ApiField("op_type")
	private String opType;

	/**
	 * 外部平台导入广告库后，广告投放层级的对应的外部资源ID
	 */
	@ApiListField("outer_id_list")
	@ApiField("string")
	private List<String> outerIdList;

	public String getBizToken() {
		return this.bizToken;
	}
	public void setBizToken(String bizToken) {
		this.bizToken = bizToken;
	}

	public String getOpType() {
		return this.opType;
	}
	public void setOpType(String opType) {
		this.opType = opType;
	}

	public List<String> getOuterIdList() {
		return this.outerIdList;
	}
	public void setOuterIdList(List<String> outerIdList) {
		this.outerIdList = outerIdList;
	}

}
