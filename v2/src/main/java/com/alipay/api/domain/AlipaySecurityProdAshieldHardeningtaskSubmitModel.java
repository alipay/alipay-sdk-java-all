package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 启动加固任务
 *
 * @author auto create
 * @since 1.0, 2023-05-25 16:37:43
 */
public class AlipaySecurityProdAshieldHardeningtaskSubmitModel extends AlipayObject {

	private static final long serialVersionUID = 4244271964424127789L;

	/**
	 * 是否开启assets加固，1为开启，其他为关闭
	 */
	@ApiField("assets_protect")
	private String assetsProtect;

	/**
	 * assets加固配置，多个用逗号分隔
	 */
	@ApiField("assets_protect_config")
	private String assetsProtectConfig;

	/**
	 * 是否开启对生命周期函数进行java2jni保护，1为开启，其他为关闭
	 */
	@ApiField("enable_life_func")
	private String enableLifeFunc;

	/**
	 * 文件上传OSS后地址
	 */
	@ApiField("file_url")
	private String fileUrl;

	/**
	 * java2cjni配置文件
	 */
	@ApiListField("javatoc_jni_config")
	@ApiField("class_method_config")
	private List<ClassMethodConfig> javatocJniConfig;

	/**
	 * 运行时保护配置
	 */
	@ApiField("runtime_protect_config")
	private RuntimeProtectConfig runtimeProtectConfig;

	/**
	 * 是否开启so加固，1为开启，其他为关闭
	 */
	@ApiField("so_protect")
	private String soProtect;

	/**
	 * so加固配置，多个用逗号分隔
	 */
	@ApiField("so_protect_config")
	private String soProtectConfig;

	public String getAssetsProtect() {
		return this.assetsProtect;
	}
	public void setAssetsProtect(String assetsProtect) {
		this.assetsProtect = assetsProtect;
	}

	public String getAssetsProtectConfig() {
		return this.assetsProtectConfig;
	}
	public void setAssetsProtectConfig(String assetsProtectConfig) {
		this.assetsProtectConfig = assetsProtectConfig;
	}

	public String getEnableLifeFunc() {
		return this.enableLifeFunc;
	}
	public void setEnableLifeFunc(String enableLifeFunc) {
		this.enableLifeFunc = enableLifeFunc;
	}

	public String getFileUrl() {
		return this.fileUrl;
	}
	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}

	public List<ClassMethodConfig> getJavatocJniConfig() {
		return this.javatocJniConfig;
	}
	public void setJavatocJniConfig(List<ClassMethodConfig> javatocJniConfig) {
		this.javatocJniConfig = javatocJniConfig;
	}

	public RuntimeProtectConfig getRuntimeProtectConfig() {
		return this.runtimeProtectConfig;
	}
	public void setRuntimeProtectConfig(RuntimeProtectConfig runtimeProtectConfig) {
		this.runtimeProtectConfig = runtimeProtectConfig;
	}

	public String getSoProtect() {
		return this.soProtect;
	}
	public void setSoProtect(String soProtect) {
		this.soProtect = soProtect;
	}

	public String getSoProtectConfig() {
		return this.soProtectConfig;
	}
	public void setSoProtectConfig(String soProtectConfig) {
		this.soProtectConfig = soProtectConfig;
	}

}
