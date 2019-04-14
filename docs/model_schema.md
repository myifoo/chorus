
# Json Schema
http://json-schema.org/latest/json-schema-core.html

## Instance Data Model

6 中基本类型： null, boolean, object, array, number, string


```json
{
  "username": "tom",
  "password": "tom123"
}
```

## example
```json
{
    "package": "chorus.host.linux_server",
    "description": "",
    "class": {
        "CPUInfo": {
            "type": "object",
            "properties": {
                "Type": {
                    "type": "string"
                },
                "ClockSpeed": {
                    "type": "float",
                    "unit": "GHZ"
                }

            }
        },
        "DeviceLoad": {
            "type": "object",
            "label": "设备性能负载",
            "description": "设备性能负载",
            "properties": {
                "DeviceLoadOneMinute": {
                    "type": "float",
                    "label": "1分钟性能负载总和"
                },
                "DeviceLoadFiveMinute": {
                    "type": "float",
                    "label": "5分钟性能负载总和"
                },
                "DeviceLoadFifteenMinute": {
                    "type": "float",
                    "label": "15分钟性能负载总和"
                },
                "DeviceLoadOneMinuteAvg": {
                    "type": "float",
                    "label": "1分钟性能负载均值"
                },
                "DeviceLoadFiveMinuteAvg": {
                    "type": "float",
                    "label": "5分钟性能负载均值"
                },
                "DeviceLoadFifteenMinuteAvg": {
                    "type": "float",
                    "label": "15分钟性能负载均值"
                }
            }
        },
        "Directory": {
            "type": "object",
            "label": "目录信息",
            "description": "目录信息",
            "properties": {
                "DirectoryName": {
                    "type": "string",
                    "label": "目录名",
                    "description": "目录信息",
                },
                "DirectorySize": {
                    "type": "long",
                    "label": "目录大小",
                    "description": "目录大小",
                    "unit": "byte"
                }
            }
        },
        "Ip": {
            "type": "object",
            "properties": {
                "ipv4": {
                    "type": "string"
                },
                "ipv6": {
                    "type": "string"
                }
            }
        },
        "Address": {
            "type": "object",
            "properties": {
                "name": {
                    "type": "string"
                }
            }
        },
        "HostAddress": {
            "type": "Address",
            "properties": {
                "ip": {
                    "type": "string"
                }
            }
        },
        "MiddleWareAddress": {
            "type": "Address",
            "properties": {
                "ip": {
                    "type": "string"
                },
                "port": {
                    "type": "string"
                }
            }
        },
        "ServiceEndPoint": {
            "type": "EndPoint",
            "properties": {
                "ip": {
                    "type": "string"
                },
                "port": {
                    "type": "string"
                }
            }
        },
        "Host": {
            "type": "object",
            "label": "服务器设备",
            "properties": {
                "name": {
                    "type": "string"
                },
                "ip": {
                    "type": "string"
                },
                "osType": {
                    "type": "string"
                },
                "version": {
                    "type": "string"
                }
            }
        },
        "LinuxServer": {
            "type": "Host",
            "label": "Linux服务器设备",
            "description": "提供对Linux服务器设备的各种配置、性能参数的采集",

        }
    }
}
```

# Data Types

基本类型： object, array, string, integer, float

类型声明示例：

```yaml
SimpleClass:
    type: object
    properties:
        name:
            type: sting
        age:
            type: integer

SimpleList:
    type: array
    items: SimpleClass

SimpleList2:
    type: array
    items:
        name:
            type: string
        age:
            type: integer
        simple:
            type: SimpleClass

```

继承关系模型示例：
```yaml
ComplexClass:
  extends:
```

