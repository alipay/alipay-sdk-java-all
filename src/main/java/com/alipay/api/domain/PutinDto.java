package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 投放信息
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:38
 */
public class PutinDto extends AlipayObject {

	private static final long serialVersionUID = 3443917274688126487L;

	/**
	 * 口碑店铺展示
	 */
	@ApiListField("show_scene")
	@ApiField("string")
	private List<String> showScene;

	public List<String> getShowScene() {
		return this.showScene;
	}
	public void setShowScene(List<String> showScene) {
		this.showScene = showScene;
	}

}
