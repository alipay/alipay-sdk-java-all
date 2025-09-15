package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑菜品虚拟类目菜品同步简化接口
 *
 * @author auto create
 * @since 1.0, 2022-01-04 10:35:26
 */
public class KoubeiCateringDishVirtualcategorySyncModel extends AlipayObject {

	private static final long serialVersionUID = 1455791811886482726L;

	/**
	 * 类目信息
	 */
	@ApiField("catetory_info")
	private KbdishVirtualCatetorySimplifyInfo catetoryInfo;

	public KbdishVirtualCatetorySimplifyInfo getCatetoryInfo() {
		return this.catetoryInfo;
	}
	public void setCatetoryInfo(KbdishVirtualCatetorySimplifyInfo catetoryInfo) {
		this.catetoryInfo = catetoryInfo;
	}

}
