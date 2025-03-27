package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 运动走路线-路线元数据模型封装类
 *
 * @author auto create
 * @since 1.0, 2023-10-19 09:53:56
 */
public class WalkPathMetaDataResult extends AlipayObject {

	private static final long serialVersionUID = 7882338739986867572L;

	/**
	 * 路线元数据列表
	 */
	@ApiListField("paths")
	@ApiField("walk_path_meta_data")
	private List<WalkPathMetaData> paths;

	public List<WalkPathMetaData> getPaths() {
		return this.paths;
	}
	public void setPaths(List<WalkPathMetaData> paths) {
		this.paths = paths;
	}

}
