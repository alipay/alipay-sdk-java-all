package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 飞猪内容对接内容阅读数点赞数同步接口
 *
 * @author auto create
 * @since 1.0, 2017-12-15 13:52:27
 */
public class AlipayOverseasTravelContentCountSyncModel extends AlipayObject {

	private static final long serialVersionUID = 2364955446856353233L;

	/**
	 * 计数信息列表，表大小不超过2000个
	 */
	@ApiListField("count_infos")
	@ApiField("count_info")
	private List<CountInfo> countInfos;

	public List<CountInfo> getCountInfos() {
		return this.countInfos;
	}
	public void setCountInfos(List<CountInfo> countInfos) {
		this.countInfos = countInfos;
	}

}
