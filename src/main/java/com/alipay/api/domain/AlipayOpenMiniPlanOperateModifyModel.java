package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 修改支付后推荐方案优先级
 *
 * @author auto create
 * @since 1.0, 2019-10-05 17:31:26
 */
public class AlipayOpenMiniPlanOperateModifyModel extends AlipayObject {

	private static final long serialVersionUID = 4733873616612844477L;

	/**
	 * 小程序投放方案场景码，目前只支持传入支付后推荐场景码：PAYMENT_SUCCESS
	 */
	@ApiField("scene")
	private String scene;

	/**
	 * 目前只支持小程序和生活号类型的优先级调整，若需要调整小程序优先，请传TINYAPP,PUBLICAPP；若需要调整生活号优先，请传PUBLICAPP,TINYAPP
	 */
	@ApiField("type_list")
	private String typeList;

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

	public String getTypeList() {
		return this.typeList;
	}
	public void setTypeList(String typeList) {
		this.typeList = typeList;
	}

}
