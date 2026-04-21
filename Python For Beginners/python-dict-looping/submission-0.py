from typing import Dict, List # this adds type hints for List and Dict

def get_dict_keys(age_dict: Dict[str, int]) -> List[str]:
    return_list = []
    for key in age_dict:
        return_list.append(key)
    return return_list

def get_dict_values(age_dict: Dict[str, int]) -> List[int]:
    return_values = []
    for key, value in age_dict.items():
        return_values.append(value)
    return return_values

# do not modify below this line
dict_1 = {"John": 25, "Doe": 30, "Jane": 22}
dict_2 = {"NeetCode": 24, "NeetCode2": 25, "NeetCode3": 26}

print(get_dict_keys(dict_1))
print(get_dict_keys(dict_2))

print(get_dict_values(dict_1))
print(get_dict_values(dict_2))
