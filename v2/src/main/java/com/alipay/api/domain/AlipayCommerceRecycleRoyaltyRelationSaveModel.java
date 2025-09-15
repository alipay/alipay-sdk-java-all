package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 回收平台分账关系保存接口
 *
 * @author auto create
 * @since 1.0, 2025-08-11 22:47:28
 */
public class AlipayCommerceRecycleRoyaltyRelationSaveModel extends AlipayObject {

	private static final long serialVersionUID = 6596253987432992833L;

	/**
	 * 关系绑定处理类型枚举
	 */
	@ApiField("handle_type")
	private String handleType;

	/**
	 * 分账关系操作列表，每次最多20个
	 */
	@ApiListField("relation_list")
	@ApiField("recycle_royalty_relation_v_o")
	private List<RecycleRoyaltyRelationVO> relationList;

	public String getHandleType() {
		return this.handleType;
	}
	public void setHandleType(String handleType) {
		this.handleType = handleType;
	}

	public List<RecycleRoyaltyRelationVO> getRelationList() {
		return this.relationList;
	}
	public void setRelationList(List<RecycleRoyaltyRelationVO> relationList) {
		this.relationList = relationList;
	}

}
