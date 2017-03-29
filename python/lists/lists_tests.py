import unittest

import lists


class ListTests(unittest.TestCase):
    def test_largest(self):
        self.assertEqual(3, lists.largest([1, 2, 3]))
        self.assertEqual(None, lists.largest([]))
        self.assertEqual(-3, lists.largest([-5, -3, -6]))

    def test_reverse(self):
        self.assertEqual(['c', 'b', 'a'], lists.reverse(['a', 'b', 'c']))
        self.assertEqual([], lists.reverse([]))
        self.assertEqual([3, 2, 1], lists.reverse([1, 2, 3]))

    def test_all_odd(self):
        self.assertEqual([1, 3], lists.all_odd([1, 2, 3]))
        self.assertEqual([], lists.all_odd([]))
        self.assertRaises(ValueError, lists.all_odd([1, 2, 3, "a", ]))

    def test_contains(self):
        self.assertEqual(lists.contains([2], 2), True)
        self.assertEqual(lists.contains([1, 2, 3], 2), True)
        self.assertEqual(lists.contains([1, 2, 3], 4), False)
        self.assertEqual(lists.contains([], 2), False)

    def test_total(self):
        self.assertEqual(6, lists.total([1, 2, 3]))
        self.assertEqual(0, lists.total([]))
        self.assertRaises(ValueError, lists.total([1, 2, 3, "a", ]))
