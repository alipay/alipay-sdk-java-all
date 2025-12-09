package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 查询棋盘圈选图灵标签
 *
 * @author auto create
 * @since 1.0, 2023-12-04 15:22:58
 */
public class AlipayMerchantQipanTuringtagQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8128279838691952836L;

	/**
	 * 节点编码列表
	 */
	@ApiListField("node_code_list")
	@ApiField("string")
	private List<String> nodeCodeList;

	public List<String> getNodeCodeList() {
		return this.nodeCodeList;
	}
	public void setNodeCodeList(List<String> nodeCodeList) {
		this.nodeCodeList = nodeCodeList;
	}

}
