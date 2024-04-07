package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 资产共享来源信息
 *
 * @author auto create
 * @since 1.0, 2023-10-12 17:19:10
 */
public class AssetShareSourceInfo extends AlipayObject {

	private static final long serialVersionUID = 7617465782761794576L;

	/**
	 * 当前规则可用的资产来源类型，搭配source_id_list使用。
	 */
	@ApiField("share_mode")
	private String shareMode;

	/**
	 * 资产共享来源id列表，与share_mode配合设置
	 */
	@ApiListField("source_id_list")
	@ApiField("string")
	private List<String> sourceIdList;

	public String getShareMode() {
		return this.shareMode;
	}
	public void setShareMode(String shareMode) {
		this.shareMode = shareMode;
	}

	public List<String> getSourceIdList() {
		return this.sourceIdList;
	}
	public void setSourceIdList(List<String> sourceIdList) {
		this.sourceIdList = sourceIdList;
	}

}
