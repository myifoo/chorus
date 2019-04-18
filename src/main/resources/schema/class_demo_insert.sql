INSERT INTO public.class_model(package, name, label, modifier, scope, description)
	VALUES ('chorus', 'IP', 'IP 地址', '', 'global', '');

INSERT INTO public.class_model(package, name, label, modifier, scope, description)
	VALUES ('chorus', 'Account', '账号参数', '', 'global', '通过账号信息访问管理对象获取/写入指标数据所需要的访问参数');

INSERT INTO public.class_model(package, name, label, modifier, scope, description)
	VALUES ('chorus', 'Address', '地址', 'abstract', 'global', '');

INSERT INTO public.class_model(package, name, label, modifier, scope, description)
	VALUES ('chorus.host', 'HostAddress', '主机地址', '', 'global', '');

INSERT INTO public.class_model(package, name, label, modifier, scope, description)
	VALUES ('chorus.host', 'ServerAddress', '服务器地址', '', 'global', '');

INSERT INTO public.class_model(package, name, label, modifier, scope, description)
	VALUES ('chorus.host', 'URLAddress', '服务地址', '', 'global', '');

INSERT INTO public.class_model(package, name, label, modifier, scope, description)
	VALUES ('chorus', 'AccessParameter', '访问参数', 'abstract', 'global', '');

INSERT INTO public.class_model(package, name, label, modifier, scope, description)
	VALUES ('chorus', 'HardwareParameter', '硬件访问参数', '', 'global', '');

INSERT INTO public.class_model(package, name, label, modifier, scope, description)
	VALUES ('chorus', 'SNMPParameter', 'SNMP访问参数', '', 'global', '通过SNMP协议访问管理对象获取/写入指标数据所需要的访问参数');

INSERT INTO public.class_model(package, name, label, modifier, scope, description)
	VALUES ('chorus', 'ICMPParameter', 'ICMP访问参数', '', 'global', '通过ICMP协议测试管理管理对象的连通性');

INSERT INTO public.class_model(package, name, label, modifier, scope, description)
	VALUES ('chorus', 'TelnetParameter', 'Telnet访问参数', '', 'global', '通过Telnet登录到被管资源时的用户名、密码信息');

INSERT INTO public.class_model(package, name, label, modifier, scope, description)
	VALUES ('chorus', 'WMIParameter', 'WMI访问参数', '', 'global', '通过WMI方式访问管理对象获取/写入指标数据所需要的访问参数');

INSERT INTO public.class_model(package, name, label, modifier, scope, description)
	VALUES ('chorus', 'SNMPRWTest', 'SNMP读写测试', '', 'global', '测试目标地址是否能用指定的SNMP参数进行SNMP读写访问');

INSERT INTO public.class_model(package, name, label, modifier, scope, description)
	VALUES ('chorus.host', 'Host', '服务器设备', 'abstract', 'global', '');

INSERT INTO public.class_model(package, name, label, modifier, scope, description)
	VALUES ('chorus.host', 'LinuxServer', 'Linux服务器设备', '', 'global', '提供对Linux服务器设备的各种配置、性能参数的采集');

INSERT INTO public.class_model(package, name, label, modifier, scope, description)
	VALUES ('chorus.host.LinuxServer', 'CPUInfo', 'CPU信息', '', 'package', '');

INSERT INTO public.class_model(package, name, label, modifier, scope, description)
  VALUES ('chorus.host.LinuxServer', 'DeviceLoad', '设备性能负载', '', 'package', '');

INSERT INTO public.class_model(package, name, label, modifier, scope, description)
	VALUES ('chorus.host.LinuxServer', 'Directory', '设备性能负载', '', 'package', '');

INSERT INTO public.class_model(package, name, label, modifier, scope, description)
	VALUES ('chorus.host.LinuxServer', 'DiskCountInfo', '硬盘统计信息', '', 'package', '');

INSERT INTO public.class_model(package, name, label, modifier, scope, description)
	VALUES ('chorus.host.LinuxServer', 'DiskInfo', '磁盘信息', '', 'package', '');

INSERT INTO public.class_model(package, name, label, modifier, scope, description)
  VALUES ('chorus.host.LinuxServer', 'DiskStatisticInfo', '硬盘状态信息', '', 'package', '');

INSERT INTO public.class_model(package, name, label, modifier, scope, description)
	VALUES ('chorus.host.LinuxServer', 'FileInfo', '系统的指定文件信息', '', 'package', '服务器设备系统中指定文件的用户信息');

INSERT INTO public.class_model(package, name, label, modifier, scope, description)
	VALUES ('chorus.host.LinuxServer', 'FluxStatistic', '流量统计', '', 'package', '网络设备的接口的流量数据统计');

INSERT INTO public.class_model(package, name, label, modifier, scope, description)
	VALUES ('chorus.host.LinuxServer', 'InstallSoftware', '安装软件', '', 'package', '');

INSERT INTO public.class_model(package, name, label, modifier, scope, description)
  VALUES ('chorus.host.LinuxServer', 'LinuxAgentParameter', 'Agent访问参数', '', 'package', '通过代理访问管理对象获取指标数据所需要的访问参数');

INSERT INTO public.class_model(package, name, label, modifier, scope, description)
	VALUES ('chorus.host.LinuxServer', 'LinuxSSHParameter', 'SSH访问参数', '', 'package', '通过SSH协议访问管理对象获取指标数据所需要的访问参数');

INSERT INTO public.class_model(package, name, label, modifier, scope, description)
	VALUES ('chorus.host.LinuxServer', 'OSCPU', '系统CPU平均信息', '', 'package', '服务器设备的CPU资源总体使用信息');

