package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 运行时加固配置
 *
 * @author auto create
 * @since 1.0, 2023-05-25 16:28:19
 */
public class RuntimeProtectConfig extends AlipayObject {

	private static final long serialVersionUID = 5897558621756339468L;

	/**
	 * 防调试,0为检测到风险退出，1不处理
	 */
	@ApiField("anti_debug")
	private Long antiDebug;

	/**
	 * 模拟器检查,0为检测到风险退出，1不处理
	 */
	@ApiField("anti_emulator")
	private Long antiEmulator;

	/**
	 * 防hook,0为检测到风险退出，1不处理
	 */
	@ApiField("anti_hook")
	private Long antiHook;

	/**
	 * 防注入,防内存dump,防内存数据修改、读取,0为检测到风险退出，1不处理
	 */
	@ApiField("anti_inject")
	private Long antiInject;

	/**
	 * 防多开软件运行,0为检测到风险退出，1不处理
	 */
	@ApiField("anti_multi_app")
	private Long antiMultiApp;

	/**
	 * 防root,0为检测到风险退出，1不处理
	 */
	@ApiField("anti_root")
	private Long antiRoot;

	/**
	 * 重打包,签名校验,AndroidManifest防篡改,签名文件保护,0为检测到风险退出，1不处理
	 */
	@ApiField("anti_signature")
	private Long antiSignature;

	public Long getAntiDebug() {
		return this.antiDebug;
	}
	public void setAntiDebug(Long antiDebug) {
		this.antiDebug = antiDebug;
	}

	public Long getAntiEmulator() {
		return this.antiEmulator;
	}
	public void setAntiEmulator(Long antiEmulator) {
		this.antiEmulator = antiEmulator;
	}

	public Long getAntiHook() {
		return this.antiHook;
	}
	public void setAntiHook(Long antiHook) {
		this.antiHook = antiHook;
	}

	public Long getAntiInject() {
		return this.antiInject;
	}
	public void setAntiInject(Long antiInject) {
		this.antiInject = antiInject;
	}

	public Long getAntiMultiApp() {
		return this.antiMultiApp;
	}
	public void setAntiMultiApp(Long antiMultiApp) {
		this.antiMultiApp = antiMultiApp;
	}

	public Long getAntiRoot() {
		return this.antiRoot;
	}
	public void setAntiRoot(Long antiRoot) {
		this.antiRoot = antiRoot;
	}

	public Long getAntiSignature() {
		return this.antiSignature;
	}
	public void setAntiSignature(Long antiSignature) {
		this.antiSignature = antiSignature;
	}

}
