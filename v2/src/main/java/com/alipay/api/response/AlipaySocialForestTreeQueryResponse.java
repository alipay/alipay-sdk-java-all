package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.TreeData;
import com.alipay.api.domain.TreeDetailData;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.forest.tree.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-14 17:04:12
 */
public class AlipaySocialForestTreeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3134913395594858597L;

	/** 
	 * 森林开通状态：
NON_OPEN：未开通；【种树记录列表为空list】
OPEN：已开通；
CLOSED：已关闭；
	 */
	@ApiField("forest_status")
	private String forestStatus;

	/** 
	 * 数据格式为List<TreeData>，按树种、是否合种分类统计后得到用户种植树信息数据列表
	 */
	@ApiListField("tree_datas")
	@ApiField("tree_data")
	private List<TreeData> treeDatas;

	/** 
	 * 种树详细信息
	 */
	@ApiListField("tree_detail_data")
	@ApiField("tree_detail_data")
	private List<TreeDetailData> treeDetailData;

	public void setForestStatus(String forestStatus) {
		this.forestStatus = forestStatus;
	}
	public String getForestStatus( ) {
		return this.forestStatus;
	}

	public void setTreeDatas(List<TreeData> treeDatas) {
		this.treeDatas = treeDatas;
	}
	public List<TreeData> getTreeDatas( ) {
		return this.treeDatas;
	}

	public void setTreeDetailData(List<TreeDetailData> treeDetailData) {
		this.treeDetailData = treeDetailData;
	}
	public List<TreeDetailData> getTreeDetailData( ) {
		return this.treeDetailData;
	}

}
