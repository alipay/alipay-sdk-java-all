package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * n线圈广告场景任务查询
 *
 * @author auto create
 * @since 1.0, 2025-05-21 17:16:31
 */
public class AlipayOpenSpNcardadvertiseTaskQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8689688669535647372L;

	/**
	 * c端碰一碰线圈后，是用支付宝服务可以获取到的线圈业务id
	 */
	@ApiListField("tag_id_list")
	@ApiField("string")
	private List<String> tagIdList;

	public List<String> getTagIdList() {
		return this.tagIdList;
	}
	public void setTagIdList(List<String> tagIdList) {
		this.tagIdList = tagIdList;
	}

}
