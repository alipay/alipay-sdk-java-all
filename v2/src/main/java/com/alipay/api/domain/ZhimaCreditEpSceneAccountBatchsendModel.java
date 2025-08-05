package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 芝麻企业信用场景账户批量信息同步接口
 *
 * @author auto create
 * @since 1.0, 2025-06-24 14:36:49
 */
public class ZhimaCreditEpSceneAccountBatchsendModel extends AlipayObject {

	private static final long serialVersionUID = 2623881334381535649L;

	/**
	 * 平台合作方实力标场景码，用于标识批量通知来源
	 */
	@ApiField("label_scene_code")
	private String labelSceneCode;

	/**
	 * list中每一项同步一个商户的相关信息
	 */
	@ApiListField("sync_list")
	@ApiField("string")
	private List<String> syncList;

	public String getLabelSceneCode() {
		return this.labelSceneCode;
	}
	public void setLabelSceneCode(String labelSceneCode) {
		this.labelSceneCode = labelSceneCode;
	}

	public List<String> getSyncList() {
		return this.syncList;
	}
	public void setSyncList(List<String> syncList) {
		this.syncList = syncList;
	}

}
