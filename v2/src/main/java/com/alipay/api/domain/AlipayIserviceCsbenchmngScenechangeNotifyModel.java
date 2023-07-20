package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 方舟控制台场景基础信息同步
 *
 * @author auto create
 * @since 1.0, 2023-05-04 11:31:50
 */
public class AlipayIserviceCsbenchmngScenechangeNotifyModel extends AlipayObject {

	private static final long serialVersionUID = 7688123333624925427L;

	/**
	 * ServiceSceneBasicVO
	 */
	@ApiListField("service_scene_list")
	@ApiField("service_scene_basic_v_o")
	private List<ServiceSceneBasicVO> serviceSceneList;

	public List<ServiceSceneBasicVO> getServiceSceneList() {
		return this.serviceSceneList;
	}
	public void setServiceSceneList(List<ServiceSceneBasicVO> serviceSceneList) {
		this.serviceSceneList = serviceSceneList;
	}

}
