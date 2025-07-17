package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 餐区信息同步
 *
 * @author auto create
 * @since 1.0, 2018-11-16 17:24:30
 */
public class KoubeiCateringPosDeskareaSyncModel extends AlipayObject {

	private static final long serialVersionUID = 1193651893494854152L;

	/**
	 * 餐区信息
	 */
	@ApiField("desk_area")
	private DeskAreaEntity deskArea;

	/**
	 * 标识接口所做操作，add 新增，update 修改，del 删除,其他返回 null
	 */
	@ApiField("type")
	private String type;

	public DeskAreaEntity getDeskArea() {
		return this.deskArea;
	}
	public void setDeskArea(DeskAreaEntity deskArea) {
		this.deskArea = deskArea;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
