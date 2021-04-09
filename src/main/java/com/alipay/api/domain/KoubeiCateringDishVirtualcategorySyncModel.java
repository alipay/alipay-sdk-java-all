package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑菜品虚拟类目菜品同步简化接口
 *
 * @author auto create
 * @since 1.0, 2020-12-14 15:05:18
 */
public class KoubeiCateringDishVirtualcategorySyncModel extends AlipayObject {

	private static final long serialVersionUID = 6832678487492557565L;

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
